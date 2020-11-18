import java.util.stream.Stream;

public interface INode {

    String getCode();
    String getRenderer();

    default int getCount() {
        return 0;
    }

    Stream<INode> toStream();
}
