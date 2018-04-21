package core.common;

import com.aspose.words.ReplacingArgs;

/**
 * 统一Word报告生成系统（UWR）
 * 数据呈现接口
 * @author 王铮 18640548252
 * 
 */
public interface HolderRender {
	public int render(DataHolder dh, ReplacingArgs e, String[] varinfo) throws Exception;

}
