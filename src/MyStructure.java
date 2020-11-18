import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MyStructure implements IMyStructure, ICompositeNode{

    private final List<INode> nodes = new LinkedList<>();

    private INode findByPredicate(Predicate<INode> p){
        return nodes.stream()
                .flatMap(INode::toStream)
                .filter(p)
                .findFirst()
                .orElse(null);

    }

    @Override
    public INode findByCode(String code) {
        return findByPredicate(c -> code.equals(c.getCode()));
    }

    @Override
    public INode findByRenderer(String renderer) {

        return findByPredicate(r -> renderer.equals(r.getRenderer()));
    }



    @Override
    public int count() {
        return (int) nodes.stream()
                .count();
    }

    public void addNode(Node node){

        nodes.add(node);

    }


    @Override
    public List<INode> getNodes() {
        return nodes;
    }

    @Override
    public String getCode() {
        return null;
    }

    @Override
    public String getRenderer() {
        return null;
    }

    @Override
    public Stream<INode> toStream() {
        return null;
    }
}
