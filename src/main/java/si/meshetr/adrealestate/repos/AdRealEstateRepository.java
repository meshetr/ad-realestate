package si.meshetr.adrealestate.repos;

import org.springframework.data.repository.PagingAndSortingRepository;
import si.meshetr.adrealestate.models.RealEstateAd;

public interface AdRealEstateRepository extends PagingAndSortingRepository<RealEstateAd, Long> {

}
