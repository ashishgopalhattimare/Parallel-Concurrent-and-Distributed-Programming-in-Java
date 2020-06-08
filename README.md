# Parallel-Concurrent-and-Distributed-Programming-in-Java
Parallel, Concurrent, and Distributed Programming in Java | Coursera


## Parallel Programming in Java

<b><u>Week 1 : Task Parallelism</u></b>
- [ ] Demonstrate task parallelism using Asynkc/Finish constructs
- [ ] Create task-parallel programs using Java's Fork/Join Framework
- [ ] Interpret Computation Graph abstraction for task-parallel programs
- [ ] Evaluate the Multiprocessor Scheduling problem using Computation Graphs
- [ ] Assess sequetional bottlenecks using Amdahl's Law

✅ <i>Mini project 1 : Reciproncal-Array-Sum using the Java Fork/Join Framework</i>

<b><u>Week 2 : Functional Parallelism</u></b>

- [ ] Demonstrate functional parallelism using the Future construct
- [ ] Create functional-parallel programs using Java's Fork/Join Framework
- [ ] Apply the princple of memoization to optimize functional parallelism
- [ ] Create functional-parallel programs using Java Streams
- [ ] Explain the concepts of data races and functional/structural determinism

✅ <i>Mini project 2 : Analysing Student Statistics Using Java Parallel Streams</i>

<b><u>Week 3 : Loop Parallelism</u></b>
- [ ] Create programs with loop-level parallelism using the Forall and Java Stream constructs
- [ ] Evaluate loop-level parallelism in a matrix-multiplication example
- [ ] Examine the barrier construct for parallel loops
- [ ] Evaluate parallel loops with barriers in an iterative-averaging example
- [ ] Apply the concept of iteration grouping/chunking to improve the performance of parallel loops

✅ <i>Mini project 3 : Parallelizing Matrix-Matrix Multiply Using Loop Parallelism</i>

<b><u>Week 4 : Data flow Synchronization and Pipelining</u></b>
- [ ] Create split-phase barriers using Java's Phaser construct
- [ ] Create point-to-point synchronization patterns using Java's Phaser construct
- [ ] Evaluate parallel loops with point-to-point synchronization in an iterative-averaging example
- [ ] Analyze pipeline parallelism using the principles of point-to-point synchronization
- [ ] Interpret data flow parallelism using the data-driven-task construct

✅ <i>Mini project 4 : Using Phasers to Optimize Data-Parallel Applications</i>

## Concurrent Programming in Java
	
<b><u>Week 1 : Threads and Locks</u></b>
- [ ] Understand the role of Java threads in building concurrent programs
- [ ] Create concurrent programs using Java threads and the synchronized statement (structured locks)
- [ ] Create concurrent programs using Java threads and lock primitives in the java.util.concurrent library (unstructured locks)
- [ ] Analyze programs with threads and locks to identify liveness and related concurrency bugs
- [ ] Evaluate different approaches to solving the classical Dining Philosophers Problem

✅ <i>Mini project 1 : Locking and Synchronization</i>

<b><u>Week 2 : Critical Sections and Isolation</u></b>
- [ ] Create concurrent programs with critical sections to coordinate accesses to shared resources
- [ ] Create concurrent programs with object-based isolation to coordinate accesses to shared resources with more overlap than critical sections
- [ ] Evaluate different approaches to implementing the Concurrent Spanning Tree algorithm
- [ ] Create concurrent programs using Java's atomic variables
- [ ] Evaluate the impact of read vs. write operations on concurrent accesses to shared resources

✅ <i>Mini project 2 : Global and Object-Based Isolation</i>

<b><u>Week 3 : Actors</u></b>
- [ ] Understand the Actor model for building concurrent programs
- [ ] Create simple concurrent programs using the Actor model
- [ ] Analyze an Actor-based implementation of the Sieve of Eratosthenes program
- [ ] Create Actor-based implementations of the Producer-Consumer pattern
- [ ] Create Actor-based implementations of concurrent accesses on a bounded resource

✅ <i>Mini project 3 : Sieve of Eratosthenes Using Actor Parallelism</i>

<b><u>Week 4 : Concurrent Data Structures</u></b>
- [ ] Understand the principle of optimistic concurrency in concurrent algorithms
- [ ] Understand implementation of concurrent queues based on optimistic concurrency
- [ ] Understand linearizability as a correctness condition for concurrent data structures
- [ ] Create concurrent Java programs that use the java.util.concurrent.ConcurrentHashMap library
- [ ] Analyze a concurrent algorithm for computing a Minimum Spanning Tree of an undirected graph

✅ <i>Mini project 4 : Parallelization of Boruvka's Minimum Spanning Tree Algorithm</i>

## Distributed Programming in Java

<b><u>Week 1 : Distributed Map Reduce</u></b>
- [ ] Explain the MapReduce paradigm for analyzing data represented as key-value pairs
- [ ] Apply the MapReduce paradigm to programs written using the Apache Hadoop framework
- [ ] Create Map Reduce programs using the Apache Spark framework
- [ ] Acknowledge the TF-IDF statistic used in data mining, and how it can be computed using the MapReduce paradigm
- [ ] Create an implementation of the PageRank algorithm using the Apache Spark framework

✅ <i>Mini project 1 : Page Rank with Spark</i>

<b><u>Week 2 : Client-Server Programming</u></b>
- [ ] Generate distributed client-server applications using sockets
- [ ] Demonstrate different approaches to serialization and deserialization of data structures for distributed programming
- [ ] Recall the use of remote method invocations as a higher-level primitive for distributed programming (compared to sockets)
- [ ] Evaluate the use of multicast sockets as a generalization of sockets
- [ ] Employ distributed publish-subscribe applications using the Apache Kafka framework

✅ <i>Mini project 2 : Filer Server</i>

<b><u>Week 3 : Message Passing</u></b>
- [ ] Create distributed applications using the Single Program Multiple Data (SPMD) model
- [ ] Create message-passing programs using point-to-point communication primitives in MPI
- [ ] Identify message ordering and deadlock properties of MPI programs
- [ ] Evaluate the advantages of non-blocking communication relative to standard blocking communication primitives
- [ ] Explain collective communication as a generalization of point-to-point communication

✅ <i>Mini project 3 : Matrix Multiply in MPI</i>

<b><u>Week 4 : Combining Distribution and Multuthreading</u></b>
- [ ] Distinguish processes and threads as basic building blocks of parallel, concurrent, and distributed Java programs
- [ ] Create multithreaded servers in Java using threads and processes
- [ ] Demonstrate how multithreading can be combined with message-passing programming models like MPI
- [ ] Analyze how the actor model can be used for distributed programming
- [ ] Assess how the reactive programming model can be used for distrubted programming

✅ <i>Mini project 4 : Multi-Threaded File Server</i>
