import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;

/**
 * Created by Administrator on 2017/12/30 0030.
 */
public class ServerDemo {

    private static int port = 12345;

    public static void main(String args[]) {

        //服务端
        EventLoopGroup boss = new NioEventLoopGroup();
        //客户端
        EventLoopGroup worker = new NioEventLoopGroup();
        ChannelFuture channelFuture = null;

        ServerBootstrap bootstrap = new ServerBootstrap();
        bootstrap.group(boss,worker);
        bootstrap.childHandler(new HandleInfo());
        try {
            //异步监听端口
            channelFuture = bootstrap.bind(port).sync();
            //监听信道关了调用
            channelFuture.channel().close();
        } catch (InterruptedException e) {
            //

        }
        finally {
            boss.shutdownGracefully();
            worker.shutdownGracefully();
        }

    }

}
