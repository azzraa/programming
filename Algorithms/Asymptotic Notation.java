/* 
Θ(1). This is constant runtime. This is the runtime when a program will always do the same thing regardless of the input. For instance, a program that only prints “hello, world” runs in Θ(1) because the program will always just print “hello, world”.
Θ(log N). This is logarithmic runtime. You will see this runtime in search algorithms.
Θ(N). This is linear runtime. You will often see this when you have to iterate through an entire dataset.
Θ(N*logN). You will see this runtime in sorting algorithms.
Θ(N2). This is an example of a polynomial runtime. When N is raised to the 2nd power, it’s known as a quadratic runtime. You will see this runtime when you have to search through a two-dimensional dataset (like a matrix) or nested loops.
Θ(2N). This is exponential runtime. You will often see this runtime in recursive algorithms (Don’t worry if you don’t know what that is yet!).
Θ(N!). This is factorial runtime. You will often see this runtime when you have to generate all of the different permutations of something. For instance, a program that generates all the different ways to order the letters “abcd” would run in this runtime.*/

/*
We use asymptotic notation to describe the runtime of a program. The three types of asymptotic notation are big Theta, big Omega, and big O.
We use big Theta (Θ) to describe the runtime if the runtime of the program is the same in every case.
The different common runtimes from fastest to slowest are: Θ(1), Θ(log N), Θ(N), Θ(N log N), Θ(N2), Θ(2N), Θ(N!).
We use big Omega (Ω) to describe the best-case running time of a program.
We use big O (O) to describe the worst-case running time of a program.
We typically describe a program’s running time in terms of big O.
When finding the runtime of a program with multiple steps, you can divide the program into different sections and add the runtimes of the various sections. You can then take the slowest runtime and use that runtime to describe the entire program.
When analyzing the runtime of a program, we care about which part of the program is the slowest.
 */