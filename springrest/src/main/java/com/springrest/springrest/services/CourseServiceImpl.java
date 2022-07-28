package com.springrest.springrest.services;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
@Service
public class CourseServiceImpl implements CourseService {
	List<Course> list;
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl() {
		list=new ArrayList<Course>();
		list.add(new Course(123,"ExpressJS","This is Express Titorial"));
		list.add(new Course(124,"NodeJS","This is Node Tutorial"));
	}
	@Override
	public List<Course> getCourses(){
		return courseDao.findAll();
		//return list;
	}
	@Override
	public Course getCourse(long c) {
//		Course co=null;
//		for(Course cou:list) {
//			if(cou.getId()==c) {
//				co=cou;
//				break;
//			}
//		}
	
		
		return courseDao.getReferenceById(c); 
	}
	@Override
	public Course addCourse(Course c) {
		//list.add(c);
		courseDao.save(c);
		return c;
	}
	@Override
	public Course updateCourse(Course c) {
//		for(Course cou:list) {
//			if(cou.getId()==c.getId()) {
//				cou.setDescription((c.getDescription()).toString());
//				cou.setTitle((c.getTitle()).toString());
//				break;
//			}//list.remove(cou);
			courseDao.save(c);
		
		return c ;
	}
	
	@Override
	public void deleteCourse(long courseId) {
//		Course s=null;
//		for(Course c:list) {
//			if(c.getId()==courseId) {
//				s=c;
//				list.remove(c);
//				break;
//			}
//		}
		Course s=courseDao.getReferenceById(courseId);
		courseDao.delete(s);
	}
	

}
