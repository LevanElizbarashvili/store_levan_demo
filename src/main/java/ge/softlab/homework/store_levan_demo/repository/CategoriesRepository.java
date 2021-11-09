package ge.softlab.homework.store_levan_demo.repository;

import ge.softlab.homework.store_levan_demo.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories,Integer> {


}
