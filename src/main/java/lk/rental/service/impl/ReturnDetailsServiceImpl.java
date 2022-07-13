package lk.rental.service.impl;

import lk.rental.dto.ReturnDetailsDTO;
import lk.rental.entity.ReturnDetails;
import lk.rental.repo.ReturnDetailsRepo;
import lk.rental.service.ReturnDetailsService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ReturnDetailsServiceImpl implements ReturnDetailsService {
    @Autowired
    private ReturnDetailsRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveReturnDetails(ReturnDetailsDTO dto) {
        if (!repo.existsById(dto.getReturnId())) {
            repo.save(mapper.map(dto, ReturnDetails.class));
        } else {
            throw new RuntimeException("ReturnDetails Already Exist..!");
        }
    }

    @Override
    public void deleteReturnDetails(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the ReturnId ID..!");
        }
    }

    @Override
    public void updateReturnDetails(ReturnDetailsDTO dto) {
        if (repo.existsById(dto.getReturnId())) {
            repo.save(mapper.map(dto, ReturnDetails.class));
        } else {
            throw new RuntimeException("No Such ReturnDetails To Update..! Please Check the ID..!");
        }
    }

    @Override
    public ReturnDetailsDTO searchReturnDetails(String id) {
        if (repo.existsById(id)) {
            return mapper.map(repo.findById(id).get(), ReturnDetailsDTO.class);
        } else {
            throw new RuntimeException("No ReturnDetails For " + id + " ..!");
        }
    }

    @Override
    public List<ReturnDetailsDTO> getAllReturnDetails() {
        return mapper.map(repo.findAll(), new TypeToken<List<ReturnDetailsDTO>>() {
        }.getType());
    }
}
