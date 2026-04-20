# Transaction Fee Java Solutions

This repository contains a small Java module with six independent solutions to transaction, risk, and lookup problems. Each solution is implemented as a standalone Java class and can be compiled and executed without package dependencies.

## Included Programs

- `TransactionSystem.java`
  - Sorts transaction fees using Bubble Sort and Insertion Sort.
  - Detects high-fee outliers.

- `RiskRanking.java`
  - Sorts client risk scores in ascending order.
  - Sorts risk scores in descending order with balance as a tiebreaker.

- `TradeAnalysis.java`
  - Implements Merge Sort for ascending trade volumes.
  - Implements Quick Sort for descending trade volumes.

- `PortfolioSort.java`
  - Sorts assets by return rate using a Quick Sort variant.

- `LogSearch.java`
  - Contains Linear Search and Binary Search for log lookup.

- `RiskLookup.java`
  - Finds the floor and ceiling risk values in a sorted array.

## Project Layout

- `src/main/java/`
  - Contains all Java source files.

## How to Compile and Run

From the `src/main/java` directory, compile all files:

```powershell
javac *.java
```

Run any class independently:

```powershell
java TransactionSystem
java RiskRanking
java TradeAnalysis
java PortfolioSort
java LogSearch
java RiskLookup
```

## Notes

- No package declaration is used, so the files compile directly from the source directory.
- Each program includes its own `main` method and sample data.
