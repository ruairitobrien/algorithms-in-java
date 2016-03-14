package ruairialgoritms.unionfind;

/**
 * Created by obrier3 on 26/08/2015.
 */
public interface UnionFind {

	void union(int p, int q);

	boolean connected(int p, int q);

}
