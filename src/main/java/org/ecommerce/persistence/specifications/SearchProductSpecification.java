package org.ecommerce.persistence.specifications;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;
import org.ecommerce.persistence.models.Product;
import org.ecommerce.persistence.models.Product_;
import org.ecommerce.web.models.search.SearchProduct;

/**
 * @author sergio
 */
public class SearchProductSpecification implements Specification<Product> {

	private SearchProduct searchProduct;

	public SearchProductSpecification(SearchProduct searchProduct) {
		this.searchProduct = searchProduct;
	}

	@Override
	public Predicate toPredicate(Root<Product> root, CriteriaQuery<?> cq, CriteriaBuilder cb) {
		List<Predicate> predicates = new ArrayList<>();

		// filter by name
		if (searchProduct.getQuery() != null && !searchProduct.getQuery().isEmpty()) {
			predicates.add(
					cb.like(cb.lower(root.get(Product_.name)), "%" + searchProduct.getQuery().toLowerCase() + "%"));
		}

		// filter by product price min
		if (searchProduct.getPriceMin() != null) {
			predicates.add(cb.greaterThanOrEqualTo(root.get(Product_.price), searchProduct.getPriceMin()));
		}
		// filter by product price max
		if (searchProduct.getPriceMax() != null) {
			predicates.add(cb.lessThanOrEqualTo(root.get(Product_.price), searchProduct.getPriceMax()));
		}

		return andTogether(predicates, cb);
	}

	protected Predicate andTogether(List<Predicate> predicates, CriteriaBuilder cb) {
		return cb.and(predicates.toArray(new Predicate[0]));
	}
}
