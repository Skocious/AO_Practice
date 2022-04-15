package ServiceAccessLayer;

import DataAccessLayer.ProducerDAO;
import entities.Producer;

public interface ProducerSO extends ProducerDAO {

    Producer selectProducerId(int ProducerId, String ProducerName, int LoginId);
}
