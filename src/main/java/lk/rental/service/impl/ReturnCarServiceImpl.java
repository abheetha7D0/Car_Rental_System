package lk.rental.service.impl;

import lk.rental.dto.ReturnCarDTO;
import lk.rental.entity.ReturnCar;
import lk.rental.repo.ReturnCarRepo;
import lk.rental.service.ReturnCarService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ReturnCarServiceImpl implements ReturnCarService {

    @Autowired
    private ReturnCarRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveReturnCar(ReturnCarDTO dto) {
        if (!repo.existsById(dto.getId())) {
            repo.save(mapper.map(dto, ReturnCar.class));
        } else {
            throw new RuntimeException("ReturnCar Already Exist..!");
        }
    }

    @Override
    public void deleteReturnCar(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the ReturnCar ID.. No Such ReturnCar..!");
        }
    }

    @Override
    public void updateReturnCar(ReturnCarDTO dto) {
        if (repo.existsById(dto.getId())) {
            repo.save(mapper.map(dto, ReturnCar.class));
        } else {
            throw new RuntimeException("No Such ReturnCar To Update..! Please Check the ID..!");
        }
    }

    @Override
    public ReturnCarDTO searchReturnCar(String id) {
        if (repo.existsById(id)) {
            return mapper.map(repo.findById(id).get(), ReturnCarDTO.class);
        } else {
            throw new RuntimeException("No ReturnCar For " + id + " ..!");
        }
    }

    @Override
    public List<ReturnCarDTO> getAllReturnCars() {
        return mapper.map(repo.findAll(), new TypeToken<List<ReturnCarDTO>>() {
        }.getType());
    }
}
