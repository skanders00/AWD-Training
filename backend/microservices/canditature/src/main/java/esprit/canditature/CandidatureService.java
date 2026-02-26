package esprit.canditature;



import esprit.canditature.Job;

import esprit.canditature.JobClient;
import jakarta.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CandidatureService {
    @Autowired
    private JobClient jobServiceClient;


    public List<Job> getJobs() {
        return jobServiceClient.getAll();
    }

    public Job getJobById(int id) {
        return jobServiceClient.getById(id);
    }



}
