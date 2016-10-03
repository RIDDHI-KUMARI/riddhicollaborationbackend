package com.niit.backendDAO;

import java.util.List;

import com.niit.backendEntity.JobOpportunities;

public interface JobOpportunitiesDAO {
void saveorUpdate(JobOpportunities jobopportunities);
void edit(JobOpportunities jobopportunities);
JobOpportunities get(String id);
List<JobOpportunities> listAllJobOpportunities();
JobOpportunities FindById(String id);
void deleteJobOpportunities(String id);
}
