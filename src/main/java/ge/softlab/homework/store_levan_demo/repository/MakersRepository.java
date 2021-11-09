package ge.softlab.homework.store_levan_demo.repository;

import ge.softlab.homework.store_levan_demo.model.Makers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MakersRepository extends JpaRepository<Makers,Integer> {


}
