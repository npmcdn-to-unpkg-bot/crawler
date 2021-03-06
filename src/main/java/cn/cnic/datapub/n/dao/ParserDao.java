package cn.cnic.datapub.n.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cn.cnic.datapub.n.model.Parser;

@Repository("parserDao")
public interface ParserDao extends CrudRepository<Parser, Integer>
{
	Parser findById(int id);
	
	@Query("select count(*) from Parser")
	int countAll();
	
	@Query("from Parser")
	List<Parser> findAll();
	
	@Query("from Parser p where p.id in ?2 and p.status in ?1")
	List<Parser> findNormal(Collection<Integer> codes,Collection<Integer> subjobs);
}
