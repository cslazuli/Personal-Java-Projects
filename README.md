# Star Lifetime Estimator

Programmed in Fall 2021 by Ezinna Ononuju; Tested using Eclipse IDE

This is a Java program which can calculate the estimated lifetime of a main sequence star given its mass in solar masses (proportion of that star's mass to the sun's mass).

It uses this equation/relationship: (Lifetime of the Sun) * (Mass of Star / Mass of Sun)^2.5, which I learned of in my ASTR1020 (Stellar and Galactic Astronomy) class. 

- The mass of the sun is about 2 * 10^30 kg.
- The estimated lifetime of the sun is about 1 * 10^10 years (10 billion years).

You can find the solar masses of a variety of Main-Sequence stars on Wikipedia to test (https://en.wikipedia.org/wiki/Category:Main-sequence_stars).

Fun fact: This equation estimates the lifetime of the star on the Main Sequence (HR Diagram Explanation: https://en.wikipedia.org/wiki/Hertzsprung%E2%80%93Russell_diagram#Interpretation). It doesn't neccesarily account for it's lifetime as a red giant or supergiant. However, because the amount of time the star spends on the main sequence is orders of magnitude longer than it's later life stages, this equation is a perfectly fine approximation for the purposes of Astronomy research. As my teacher said, the scales of concepts and objects studied in Astronomy are so massive that it's sometimes okay to be off by a little bit.

Another fun fact: Stars below about 0.5 solar masses don't really follow this equation. That's because they're too small to form main sequence stars: They're your brown and red dwarf stars which fuse their hydrogen into helium at a much slower rate (as in so slow that they will outlive all other stars). This is why in the program, the main sequence star must be more than 0.5 solar masses.

Last fun fact: All stars on the main sequence are technically "dwarf stars". That means the sun is a dwarf star if you want to be semantic.
