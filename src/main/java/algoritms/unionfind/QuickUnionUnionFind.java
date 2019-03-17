package algoritms.unionfind;

/**
 * Quick-union defect: Trees can get tall. Find too expensive (could be N array
 * accesses)
 */
public class QuickUnionUnionFind implements UnionFind {

    int[] id;

    public QuickUnionUnionFind(int n) {
        id = new int[n];

        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);

        id[i] = j;
    }

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }
}
