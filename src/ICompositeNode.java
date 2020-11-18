import java.util.List;


public interface ICompositeNode extends INode {

    List<INode> getNodes();

   /** @Override
    default int getCount() {
        return getNodes(List<INode> nodes)
                .stream()
                .mapToInt(INode::getCount)
                .sum();
    } **/
}
