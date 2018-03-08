import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;

/**
 * Created by Administrator on 2017/12/30 0030.
 */
public class HandleInfo implements ChannelHandler {
    /**
     * 连上客户端添加的返回处理的结果
     * @param channelHandlerContext
     * @throws Exception
     */
    public void handlerAdded(ChannelHandlerContext channelHandlerContext) throws Exception {

    }

    public void handlerRemoved(ChannelHandlerContext channelHandlerContext) throws Exception {

    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) throws Exception {

    }
}
