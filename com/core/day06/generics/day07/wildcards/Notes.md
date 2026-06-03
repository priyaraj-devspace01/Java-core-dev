# WildCards
## Generics breaks the parent child relationship

## HOW?
Dog is-a animal.
List<Dog> not any relation to List<Animal>


Generic<A> is not subtype of Generic<B>

Generics are invariant in java
means, if A is a child of B
  Generic<A> is not child of Generic<B>

