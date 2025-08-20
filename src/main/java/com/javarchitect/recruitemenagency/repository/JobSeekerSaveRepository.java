package com.javarchitect.recruitemenagency.repository;

import com.javarchitect.recruitemenagency.entity.JobPostActivity;
import com.javarchitect.recruitemenagency.entity.JobSeekerProfile;
import com.javarchitect.recruitemenagency.entity.JobSeekerSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {

    public List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);

    List<JobSeekerSave> findByJob(JobPostActivity job);

}
