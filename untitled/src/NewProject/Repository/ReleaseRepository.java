package NewProject.Repository;

import NewProject.DTO.ReleaseDTO;

import java.util.ArrayList;
import java.util.List;

public class ReleaseRepository {
    List<ReleaseDTO>releaseDTOList = new ArrayList<>();
    public boolean ProductSell(ReleaseDTO releaseDTO) {
        return releaseDTOList.add(releaseDTO);
    }

    public List<ReleaseDTO> SellList() {
        return releaseDTOList;
    }

    public List<ReleaseDTO> SellSearch(String productName) {
        List<ReleaseDTO>releaseDTOS = new ArrayList<>();
        for (int i = 0; i < releaseDTOList.size(); i++) {
            if (releaseDTOList.get(i).getProductName().contains(productName)){
                releaseDTOS.add(releaseDTOList.get(i));
            }
        }
        return releaseDTOS;
    }
}
