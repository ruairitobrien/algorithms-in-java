package ruairialgoritms.unionfind;

/**
 * Quick-find defect: Union too expensive. Trees are flat, but too expensive to keep them flat.
 *
 * Ex. Takes N squareds (quadratic) array accesses to process sequence of N union commands on N objects.
 */
public class QuickFindUnionFind implements UnionFind {

    private int[] id;

    public QuickFindUnionFind(int n) {
        id = new int[n];

        for(int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];

        for (int i = 0; i < id.length; i++) {
            if(id[i] == pid) {
                id[i] = qid;
            }
        }
    }
}
