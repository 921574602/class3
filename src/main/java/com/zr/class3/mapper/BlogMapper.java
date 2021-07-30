package com.zr.class3.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.zr.class3.model.Blog;
import com.zr.class3.model.City;
import com.zr.class3.model.Country;
import com.zr.class3.model.Country_Language;
import com.zr.class3.model.Language;



@Repository
public interface BlogMapper {
	Blog selectBlogById(int ID);
	
	Country searchcountry(String Code);
	
	Map searchcountry_map(String Code);
	
	Country searchcountry_resultType(String Code);
	
	List<Country_Language> searchcountry_language(String Code);
	
	Country_Language searchcountry_lan(String Code);
	
	int insertcity(@Param("city") City city);
	
	int updatecity(City city);
	
	List<Language> searchlanguage_choose(@Param("Code") String Code,@Param("type") int type);
}
