package com.college_erp.back_end.repo;

import com.college_erp.back_end.model.StudentAttendence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentAttendencerepo extends JpaRepository<StudentAttendence,Integer> {
}
