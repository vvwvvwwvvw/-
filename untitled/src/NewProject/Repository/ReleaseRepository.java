package NewProject.Repository;

import NewProject.DTO.ReleaseDTO;

import java.util.ArrayList;
import java.util.List;

public class ReleaseRepository {
    List<ReleaseDTO>releaseDTOList = new ArrayList<>();
    public boolean ProductSell(ReleaseDTO releaseDTO) {
        return releaseDTOList.add(releaseDTO);
    }
}
