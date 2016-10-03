	package com.niit.backendDAO;

	import java.util.List;

	import org.hibernate.SessionFactory;
	import org.hibernate.query.Query;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;
	import org.springframework.transaction.annotation.Transactional;

	import com.niit.backendDAO.JobOpportunitiesDAO;
import com.niit.backendEntity.JobOpportunities;
	@Repository("jobopportunitiesDAO")
	@Transactional
	public class JobOpportunitiesDAOImpl implements JobOpportunitiesDAO {
	@Autowired
	SessionFactory sessionFactory;

		@Transactional
		public void saveOrUpdate(JobOpportunities jobopportunities) {
			// TODO Auto-generated method stub
	        sessionFactory.getCurrentSession().saveOrUpdate(jobopportunities);
		}

		@Transactional
		public void editJobOpportunities(JobOpportunities jobopportunities) {
			// TODO Auto-generated method stub

		}

		@Transactional
		public JobOpportunities get(String id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Transactional
		public List<JobOpportunities> listAllJobOpportunities() {
			// TODO Auto-generated method stub
			/*@SuppressWarnings("unchecked")
			
			List<Blog> listBlog  = (List<Blog>) sessionFactory.getCurrentSession()
			.createCriteria(Blog.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return listBlog;*/
			String hql="from JobOpportunities";
			Query query=sessionFactory.getCurrentSession().createQuery(hql);
			List<JobOpportunities> listJobOpportunities=query.getResultList();
			return listJobOpportunities;
		}

				@Transactional
		public JobOpportunities findById(String id) {
			// TODO Auto-generated method stub
			String hql = "from JobOpportunities where id=" + "'" + id + "'";
			Query query =(Query) sessionFactory.getCurrentSession().createQuery(hql);
			List<JobOpportunities> listJobOpportunities= (List<JobOpportunities>) query.getResultList();
			if (listJobOpportunities!= null && !listJobOpportunities.isEmpty()) {
				return listJobOpportunities.get(0);
			}
			return null;
		}

		@Transactional
		public void deleteJobOpportunitiesById(String id) {
			// TODO Auto-generated method stub
			JobOpportunities jobopportunitiesToDelete = new JobOpportunities();
			jobopportunitiesToDelete.setId(id);
			sessionFactory.getCurrentSession().delete(jobopportunitiesToDelete);
		}

		@Override
		public void saveorUpdate(JobOpportunities jobopportunities) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void edit(JobOpportunities jobopportunities) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public JobOpportunities FindById(String id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void deleteJobOpportunities(String id) {
			// TODO Auto-generated method stub
			
		}
	}
		