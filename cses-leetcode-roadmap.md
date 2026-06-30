# CSES + LeetCode Interview Prep Roadmap

> Target: **SDE-2** at Microsoft / Google / Uber / Atlassian / Rubrik (and similar product companies).

> **Disclaimer:** All solution code in this repository is written by me. AI tools have been used to help draft and refine the code and algorithm explanations in comments — not to generate the solutions themselves.

## Why this roadmap?

Solving CSES strictly in problem-set order is great for becoming a competitive programmer, but it is **not the most efficient path for an SDE-2 interview**. Top-tier interviews lean heavily on LeetCode-style problems and pattern recognition under time pressure.

This roadmap therefore pairs each CSES problem with the closest LeetCode equivalent, so you:

1. Learn / revise an algorithm by solving the CSES version (clean inputs, focus on correctness and complexity).
2. Immediately reinforce the same pattern in an interview-style setting via LeetCode (constraints on naming, edge cases, follow-ups).
3. Build a stage-by-stage mental map of patterns, from fundamentals to advanced topics.

## How to use it

- Work **stage by stage**. Do not jump ahead until you can solve roughly 80% of a stage without help.
- For every row:
  1. Read the CSES problem statement.
  2. Attempt it for 20–30 minutes before looking up hints.
  3. Solve the paired LeetCode problem the same day (or next morning) to lock in the pattern.
  4. Write a 2–3 line note: *what is the pattern, what is the trick, what is the complexity*.
- Re-review your notes weekly. Pattern recall is what wins interviews, not raw problem count.

### Legend

- **#** — sequence number across the roadmap.
- **CSES** — problem on [cses.fi/problemset](https://cses.fi/problemset/).
- **LeetCode** — closest interview-style equivalent (a few rows reuse a problem on purpose).
- **Concept** — the pattern/algorithm to internalize.
- **Progress** — ✅ if the paired LeetCode problem is solved in this repo.

---

## Stage 1 — Fundamentals (1–5)

Goal: warm up, get comfortable with I/O, simulation, basic greedy and recursion.

| #  | CSES               | LeetCode                                                                       | Concept       | Progress |
|----|--------------------|--------------------------------------------------------------------------------|---------------|----------|
| 1  | Missing Number     | 268. Missing Number                                                            | XOR           |          |
| 2  | Repetitions        | 1446. Consecutive Characters                                                   | String scan   | ✅       |
| 3  | Increasing Array   | 1827. Minimum Operations to Make the Array Increasing                          | Greedy        | ✅       |
| 4  | Weird Algorithm    | —                                                                              | Simulation    |          |
| 5  | Apple Division     | 2035. Partition Array Into Two Arrays to Minimize Sum Difference               | Backtracking  |          |

---

## Stage 2 — Two Pointers & Sorting (6–20)

Goal: master the most common interview patterns — sorting + two pointers, hashing, sliding window, prefix sums, sweep line.

| #  | CSES                    | LeetCode                                                            | Concept              | Progress |
|----|-------------------------|---------------------------------------------------------------------|----------------------|----------|
| 6  | Distinct Numbers        | 217. Contains Duplicate                                             | Hashing              |          |
| 7  | Apartments              | 455. Assign Cookies                                                 | Two pointers         | ✅       |
| 8  | Ferris Wheel            | 881. Boats to Save People                                           | Greedy               |          |
| 9  | Sum of Two Values       | 1. Two Sum                                                          | Hashing              |          |
| 10 | Sum of Three Values     | 15. 3Sum                                                            | Sorting              |          |
| 11 | Sum of Four Values      | 18. 4Sum                                                            | Two pointers         |          |
| 12 | Stick Lengths           | 462. Minimum Moves to Equal Array Elements II                       | Median               |          |
| 13 | Maximum Subarray Sum    | 53. Maximum Subarray                                                | Kadane               |          |
| 14 | Restaurant Customers    | 253. Meeting Rooms II                                               | Sweep line           |          |
| 15 | Movie Festival          | 435. Non-overlapping Intervals                                      | Interval scheduling  |          |
| 16 | Tasks and Deadlines     | 630. Course Schedule III                                            | Greedy               |          |
| 17 | Towers                  | 354. Russian Doll Envelopes *(LIS idea)*                            | Binary search        |          |
| 18 | Playlist                | 3. Longest Substring Without Repeating Characters                   | Sliding window       |          |
| 19 | Subarray Sums I         | 560. Subarray Sum Equals K                                          | Prefix sum           |          |
| 20 | Sliding Window Median   | 480. Sliding Window Median                                          | Ordered set          |          |

---

## Stage 3 — Binary Search (21–28)

Goal: recognise *binary search on the answer*, plus heap and TreeMap-style decision problems.

| #  | CSES                  | LeetCode                                                | Concept                    | Progress |
|----|-----------------------|---------------------------------------------------------|----------------------------|----------|
| 21 | Factory Machines      | 2187. Minimum Time to Complete Trips                    | Binary search on answer    |          |
| 22 | Array Division        | 410. Split Array Largest Sum                            | Binary search              |          |
| 23 | Reading Books         | 2187 *(reasoning pattern)*                              | Greedy                     |          |
| 24 | Concert Tickets       | 1847. Closest Room                                      | TreeMap                    |          |
| 25 | Room Allocation       | 2402. Meeting Rooms III                                 | Heap                       |          |
| 26 | Josephus Problem I    | 1823. Find the Winner of the Circular Game              | Simulation                 |          |
| 27 | Josephus Problem II   | 1823                                                    | Fenwick                    |          |
| 28 | Nested Ranges Check   | 56. Merge Intervals                                     | Sorting                    |          |

> Note on #23 *Reading Books*: the answer is simply `max(sum, 2 * max)` — internalize this closed-form trick rather than over-engineering a two-pointer partition.

---

## Stage 4 — Dynamic Programming (29–45)

Goal: build a strong DP intuition across coins, knapsack, grid, intervals, bitmask, and game DP.

| #  | CSES                     | LeetCode                                                                 | Concept                | Progress |
|----|--------------------------|--------------------------------------------------------------------------|------------------------|----------|
| 29 | Dice Combinations        | 377. Combination Sum IV                                                  | DP                     | ✅       |
| 30 | Minimizing Coins         | 322. Coin Change                                                         | DP                     |          |
| 31 | Coin Combinations I      | 377. Combination Sum IV                                                  | DP                     | ✅       |
| 32 | Coin Combinations II     | 518. Coin Change II                                                      | DP                     | ✅       |
| 33 | Removing Digits          | —                                                                        | Digit DP               |          |
| 34 | Grid Paths               | 62. Unique Paths                                                         | Grid DP                |          |
| 35 | Book Shop                | 416. Partition Equal Subset Sum *(0/1 knapsack style)*                   | Knapsack               |          |
| 36 | Array Description        | 790. Domino and Tromino Tiling *(state DP)*                              | State DP               |          |
| 37 | Edit Distance            | 72. Edit Distance                                                        | Classic DP             |          |
| 38 | Rectangle Cutting        | —                                                                        | 2D DP                  |          |
| 39 | Money Sums               | 416. Partition Equal Subset Sum                                          | Subset DP              |          |
| 40 | Increasing Subsequence   | 300. Longest Increasing Subsequence                                      | LIS                    |          |
| 41 | Removal Game             | 486. Predict the Winner                                                  | Game DP                |          |
| 42 | Projects                 | 1235. Maximum Profit in Job Scheduling                                   | Weighted interval DP   |          |
| 43 | Counting Towers          | 790. Domino and Tromino Tiling                                           | DP                     |          |
| 44 | Elevator Rides           | 1125. Smallest Sufficient Team *(bitmask flavor)*                        | Bitmask DP             |          |
| 45 | Counting Tilings         | 790. Domino and Tromino Tiling                                           | DP                     |          |

---

## Stage 5 — Graph Algorithms (46–65)

Goal: BFS / DFS, shortest paths, MST, DAG DP, and the classic bitmask graph DP for Hamiltonian-style problems.

| #  | CSES                    | LeetCode                                                                                   | Concept                  | Progress |
|----|-------------------------|--------------------------------------------------------------------------------------------|--------------------------|----------|
| 46 | Counting Rooms          | 200. Number of Islands                                                                     | DFS                      | ✅       |
| 47 | Labyrinth               | 1926. Nearest Exit from Maze                                                               | BFS                      |          |
| 48 | Building Roads          | 547. Number of Provinces                                                                   | DSU                      |          |
| 49 | Message Route           | 127. Word Ladder                                                                           | BFS                      |          |
| 50 | Building Teams          | 785. Is Graph Bipartite?                                                                   | Bipartite                |          |
| 51 | Round Trip              | 684. Redundant Connection                                                                  | Cycle detection          |          |
| 52 | Round Trip II           | 802. Find Eventual Safe States                                                             | Directed cycle           |          |
| 53 | Course Schedule         | 207. Course Schedule                                                                       | Topological sort         | ✅       |
| 54 | Course Schedule II      | 210. Course Schedule II                                                                    | Topological order        |          |
| 55 | Shortest Routes I       | 743. Network Delay Time                                                                    | Dijkstra                 |          |
| 56 | Shortest Routes II      | 1334. Find the City With the Smallest Number of Neighbors                                  | Floyd–Warshall           |          |
| 57 | Flight Discount         | 2093. Minimum Cost to Reach City With Discounts                                            | Modified Dijkstra        |          |
| 58 | Investigation           | 1976. Number of Ways to Arrive at Destination                                              | Dijkstra + counting      |          |
| 59 | High Score              | 787. Cheapest Flights Within K Stops                                                       | Bellman–Ford             |          |
| 60 | Longest Flight Route    | 1857. Largest Color Value in a Directed Graph                                              | DAG DP                   |          |
| 61 | Flight Routes           | 787. Cheapest Flights Within K Stops                                                       | k-shortest paths         |          |
| 62 | Game Routes             | 2328. Number of Increasing Paths in a Grid *(counting DAG paths)*                          | DAG DP                   |          |
| 63 | Hamiltonian Flights     | 847. Shortest Path Visiting All Nodes                                                      | Bitmask DP               |          |
| 64 | Road Reparation         | 1584. Min Cost to Connect All Points                                                       | MST                      |          |
| 65 | Road Construction       | 1319. Number of Operations to Make Network Connected                                       | DSU                      |          |

---

## Stage 6 — Trees (66–80)

Goal: tree DP, rerooting, LCA, Euler tour, centroid decomposition concepts.

| #  | CSES                  | LeetCode                                                                                       | Concept           | Progress |
|----|-----------------------|------------------------------------------------------------------------------------------------|-------------------|----------|
| 66 | Subordinates          | 1519. Number of Nodes in the Sub-Tree With the Same Label *(DFS pattern)*                      | Tree DFS          |          |
| 67 | Tree Matching         | 337. House Robber III                                                                          | Tree DP           |          |
| 68 | Tree Diameter         | 543. Diameter of Binary Tree                                                                   | Diameter          |          |
| 69 | Tree Distances I      | 834. Sum of Distances in Tree                                                                  | Rerooting         |          |
| 70 | Tree Distances II     | 834. Sum of Distances in Tree                                                                  | Rerooting         |          |
| 71 | Company Queries I     | 1483. Kth Ancestor of a Tree Node                                                              | Binary lifting    |          |
| 72 | Company Queries II    | 236. Lowest Common Ancestor of a Binary Tree                                                   | LCA               |          |
| 73 | Distance Queries      | 2846. Minimum Edge Weight Equilibrium Queries in a Tree *(LCA usage)*                          | LCA               |          |
| 74 | Tree Traversals       | 105. Construct Binary Tree from Preorder and Inorder Traversal                                 | Traversals        |          |
| 75 | Path Queries          | 307. Range Sum Query – Mutable *(Euler tour + Fenwick)*                                        | Euler tour        |          |
| 76 | Path Queries II       | 2646. Minimize the Total Price of the Trips                                                    | HLD concepts      |          |
| 77 | Subtree Queries       | 307. Range Sum Query – Mutable                                                                 | Euler tour        |          |
| 78 | Distinct Colors       | 1457. Pseudo-Palindromic Paths *(small-to-large idea)*                                         | DSU on tree       |          |
| 79 | Finding a Centroid    | 310. Minimum Height Trees                                                                      | Centroid          |          |
| 80 | Tree Isomorphism      | 652. Find Duplicate Subtrees *(encoding idea)*                                                 | Tree hashing      |          |

---

## Stage 7 — Range Queries (81–90)

Goal: prefix sums, Fenwick / BIT, segment trees, sparse tables, coordinate compression.

| #  | CSES                    | LeetCode                                                              | Concept                | Progress |
|----|-------------------------|-----------------------------------------------------------------------|------------------------|----------|
| 81 | Static Range Sum        | 303. Range Sum Query                                                  | Prefix sums            |          |
| 82 | Dynamic Range Sum       | 307. Range Sum Query – Mutable                                        | Fenwick                |          |
| 83 | Static RMQ              | Sparse Table-style RMQ variants                                       | Sparse table           |          |
| 84 | Dynamic RMQ             | 307. Range Sum Query – Mutable                                        | Segment tree           |          |
| 85 | Range XOR Queries       | 1310. XOR Queries of a Subarray                                       | Prefix XOR             |          |
| 86 | Forest Queries          | 304. Range Sum Query 2D – Immutable                                   | 2D prefix sums         |          |
| 87 | Hotel Queries           | 699. Falling Squares                                                  | Segment tree           |          |
| 88 | Salary Queries          | 327. Count of Range Sum *(ordered structures)*                        | Coordinate compression |          |
| 89 | Prefix Sum Queries      | 307. Range Sum Query – Mutable                                        | Segment tree           |          |
| 90 | List Removals           | 315. Count of Smaller Numbers After Self                              | Fenwick tree           |          |

---

## Stage 8 — Strings (91–100)

Goal: KMP, prefix function, hashing, tries, palindrome algorithms, and an introduction to suffix structures.

| #   | CSES                   | LeetCode                                                            | Concept                          | Progress |
|-----|------------------------|---------------------------------------------------------------------|----------------------------------|----------|
| 91  | String Matching        | 28. Find the Index of the First Occurrence in a String              | KMP                              |          |
| 92  | Finding Borders        | 1392. Longest Happy Prefix                                          | Prefix function                  |          |
| 93  | Finding Periods        | 459. Repeated Substring Pattern                                     | KMP                              |          |
| 94  | Word Combinations      | 140. Word Break II                                                  | Trie + DP                        |          |
| 95  | Palindrome Queries     | 1177. Can Make Palindrome from Substring                            | Rolling hash                     |          |
| 96  | Longest Palindrome     | 5. Longest Palindromic Substring                                    | Manacher / expand-around-center  |          |
| 97  | Minimal Rotation       | 899. Orderly Queue                                                  | Booth's algorithm                |          |
| 98  | Finding Patterns       | 211. Design Add and Search Words Data Structure                     | Trie                             |          |
| 99  | Pattern Positions      | 212. Word Search II                                                 | Trie                             |          |
| 100 | Distinct Substrings    | 1044. Longest Duplicate Substring                                   | Suffix array / suffix automaton  |          |

---

## Suggested weekly cadence (12-week plan)

| Week  | Stages                                    | Focus                                                                 |
|-------|-------------------------------------------|-----------------------------------------------------------------------|
| 1     | Stage 1 + start Stage 2                   | Warm up, syntax, basic patterns                                       |
| 2     | Stage 2                                   | Two pointers, hashing, sliding window                                 |
| 3     | Stage 3                                   | Binary search (incl. on answer), heaps, TreeMap                       |
| 4–5   | Stage 4                                   | DP — the highest-leverage interview topic                             |
| 6–7   | Stage 5                                   | Graphs end-to-end                                                     |
| 8–9   | Stage 6                                   | Trees + LCA + Euler tour                                              |
| 10    | Stage 7                                   | Range queries (Fenwick / segment tree)                                |
| 11    | Stage 8                                   | Strings                                                               |
| 12    | Review + 2 mock interviews / week         | Revisit your notes, do system design, behavioral, and OA simulations  |

## Tracking template

Maintain a single spreadsheet or markdown table per stage with these columns:

- `#` (roadmap number)
- `CSES status` — solved / partial / stuck
- `LeetCode status` — solved without help / hint used / read editorial
- `Time taken`
- `Pattern note` (1–3 lines)
- `Re-review date` (spaced repetition: +3 days, +1 week, +3 weeks)

## Tips that compound over time

- **Solve before reading the editorial.** Even a wrong attempt encodes the pattern better than reading first.
- **Re-implement, don't re-read.** When revisiting a problem, type the full solution from scratch.
- **Always note the complexity** before submitting — interviewers ask for it almost every round.
- **Group by pattern, not by problem.** When you finish a stage, list every problem under each pattern in your own words.
- **Mocks > grinding more problems** once you've done ~70 problems. Schedule mock interviews with peers from week 8 onward.

## Out-of-scope (intentional)

These are useful long-term but **not on the critical path for an SDE-2 loop** at the listed companies:

- Heavy number theory (Mobius, CRT beyond basics)
- Geometry (convex hull, half-plane intersection)
- Max-flow / min-cost flow
- Persistent / link-cut trees, advanced segment tree beats

Pick these up only after you are consistently clearing mock interviews.
