package cn.dystudio.pokemon.mapper;

import cn.dystudio.pokemon.entity.History;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * PokeApi调用记录 Mapper 接口
 * </p>
 *
 * @author 张永清
 * @since 2023-03-02
 */
@Mapper
public interface HistoryMapper extends BaseMapper<History> {

}
