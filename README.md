# Merge Sort
This project was created for an Algorithms and Data Structure course. This is my solution for implementing Merge Sort algorithm.

### *Merge Sort Pseudocode*
```
MERGE(A, p, q, r)
1 n1 = q - p + 1
2 n2 = r - q
3 let L[1..n1 + 1] and R[1..n2 + 1] be new arrays
4 for i = 1 to n1
5     L[i] = A[p + i - 1]
6 for j = 1 to n2
7     R[j] = A[q + j]
8 L[n1 + 1] = ∞
9 R[n2 + 1] = ∞
10 i = 1
11 j = 1
12 for k = p to r
13     if L[i] ≤ R[j]
14         A[k] = L[i]
15         i = i + 1
16     else A[k] = R[j]
17         j = j + 1

MERGE-SORT(A, p, r)
1 if p < r
2     q = [(p + r)/2]
3     MERGE-SORT(A, p, q)
4     MERGE-SORT(A, q + 1, r)
5     MERGE(A, p, q, r)
```
*Introductions to Algorithms (3rd Edition) by Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, Clifford Stein*

## Built With
* Java SE-12 (jdk-12.0.1)

## External Libraries
* JUnit 5

## Authors
Grace O'Brien

## License
This project is licensed under the MIT License - see the LICENSE file for details
