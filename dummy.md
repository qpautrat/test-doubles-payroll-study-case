# Dummy

## Definition

_Dummy objects are passed around but never actually used. Usually they are just used to fill parameter lists._ (Martin Fowler)

_You don't want the dummy to be used._ (Robert Martin)

## Exercise

An employee can be an intern.
When a new employee is added, if it's an intern then its direct manager must be notified.

Run the test inside `AddNewEmployeeTest`.
Don't pay attention to the `Assert` part.
I implemented for you the test double. As Robert Martin said, dummies should not be used.
Therefore, it throws an exception if it's actually used.
Test should fail because I on purpose introduced an error. You should see a `Dummy must not been used` exception message.

Fix the implementation and make the test pass.

In which circumstances dummies could be useful?
What do they reveal?

What would you propose to get rid of the dummy ?