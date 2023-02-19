package kodlama.io.rentACar.core.utilites.mappers;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;

public interface ModelMapperService {
    ModelMapper forResponse(); // Response için model mapper
    ModelMapper forRequest(); // Request için model mapper

}
