package com.javarchitect.recruitemenagency.repository;

import com.javarchitect.recruitemenagency.entity.JobPostActivity;
import com.javarchitect.recruitemenagency.entity.JobSeekerApply;
import com.javarchitect.recruitemenagency.entity.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply, Integer> {

    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);

    List<JobSeekerApply> findByJob(JobPostActivity job);
}
