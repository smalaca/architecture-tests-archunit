# Code structure

## Status
Accepted

## Context
We need to have predefined code structure to speed up delivery.

## Solutions
1. Do whatever you want.
2. Component-Based
3. CQRS
4. Hexagonal architecture

## Decision
We will go with CQRS because it keeps read only functionality separated
from functionality that allows for modification. Thanks to that whenever
we need to work on new functionality we can quickly make decision if it 
requires upfront design and discussion or not.

## Consequences
- We need to verify if the CQRS is followed