package slre.springframework.mssc_brewery.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import slre.springframework.mssc_brewery.model.BeerDTO;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeerById(UUID beerId) {
        System.out.println(beerId);
        return BeerDTO.builder().id(UUID.randomUUID())
                .beerName("Modelo")
                .beerStyle("Lager")
                .build();
    }

    @Override
    public BeerDTO saveNewBeer(BeerDTO beerDTO) {
        return BeerDTO.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDTO beerDTO) {
        //

    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer....");
    }
}
