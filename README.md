# Kotlin Finite State Machine Hyperion [![Build Status](https://travis-ci.org/ToxicBakery/kfin-state-machine-hyperion.svg?branch=master)](https://travis-ci.org/ToxicBakery/kfin-state-machine-hyperion) [![codecov](https://codecov.io/gh/ToxicBakery/kfin-state-machine-hyperion/branch/master/graph/badge.svg)](https://codecov.io/gh/ToxicBakery/kfin-state-machine-hyperion)
[Hyperion](https://github.com/willowtreeapps/Hyperion-Android) Plugin for Monitoring [Kotlin Finate State Machines](https://github.com/ToxicBakery/kfin-state-machine)

## Sample Usage
```kotlin
// Register for viewing
KfinPlugin.registerMachine("MyMachine", myStateMachine)

// Unregister from viewing
KfinPlugin.unregisterMachine("MyMachine")
```

## Install
```groovy
debugImplementation "com.ToxicBakery.kfinstatemachine.hyperion:hyperion:2.+"
releaseImplementation "com.ToxicBakery.kfinstatemachine.hyperion:hyperion-no-op:2.+"
```

## Build
The library depends on gradle for compilation and requires JDK 8 or higher.

```bash
./gradlew build
```

