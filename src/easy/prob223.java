package easy;

public class prob223 {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        return size(A, B, C, D) + size(E, F, G, H) - findInternal(A, B, C, D, E, F, G, H);
    }
    
    private int findInternal(int A, int B, int C, int D, int E, int F, int G, int H) {
        if (A >= G || B >= H || C <= E || D <= F) return 0;
        if (A <= E && B >= F && C <= G && D >= H) return size(E, B, C, H);
        if (A >= E && B >= F && C <= G && D >= H) return size(A, B, C, H);
        if (A >= E && B >= F && C >= G && D >= H) return size(A, B, G, H);
        if (A <= E && B >= F && C <= G && D <= H) return size(E, B, C, D);
        if (A >= E && B >= F && C <= G && D <= H) return size(A, B, C, D);
        if (A >= E && B >= F && C >= G && D <= H) return size(A, B, G, D);
        if (A <= E && B <= F && C <= G && D <= H) return size(E, F, C, D);
        if (A >= E && B <= F && C <= G && D <= H) return size(A, F, C, D);
        if (A >= E && B <= F && C >= G && D <= H) return size(A, F, G, D);
        if (A <= E && B >= F && C >= G && D <= H) return size(E, B, G, D);
        return findInternal(E, F, G, H, A, B, C, D);
    }
    
    private int size(int A, int B, int C, int D) {
        return (C - A) * (D - B);
    }
}
