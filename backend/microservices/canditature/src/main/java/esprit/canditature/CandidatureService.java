package esprit.canditature;

import esprit.canditature.Repository.CandidatureRepository;
import esprit.canditature.dto.Candidat;
import esprit.canditature.dto.Job;
import esprit.canditature.entity.Candidature;
import esprit.canditature.feignclient.CandidatClient;
import esprit.canditature.feignclient.JobClient;
import jakarta.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CandidatureService {
    @Autowired
    private JobClient jobServiceClient;

    @Autowired
    private CandidatClient candidatServiceClient;
    @Autowired
    private CandidatureRepository candidatureRepository;


    public List<Job> getJobs() {
        return jobServiceClient.getAll();
    }

    public Job getJobById(int id) {
        return jobServiceClient.getById(id);
    }
    // Le reste de la logique du service Candidature
    public Candidat getCandidatById(int id) {
        return candidatServiceClient.getCandidat(id);
    }
    public Candidature addCandidature(Candidature candidature) {

        jobServiceClient.getById(candidature.getIdJob());
        candidatServiceClient.getCandidat(candidature.getIdCandidate());
        return candidatureRepository.save(candidature);
    }
//    public Response addCandidature(Candidature candidature) {
//        if(jobServiceClient.getById(candidature.getIdJob())==null || candidatServiceClient.getCandidat(candidature.getIdCandidate())==null)
//            return Response.status(Response.Status.NOT_FOUND).build();
//        else
//        {
//            candidatureRepository.save(candidature);
//            return Response.status(Response.Status.CREATED).build();
//
//        }
//
//    }


}
