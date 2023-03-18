# Legendary Rotary Phone

This is an example project for me to learn about 
Spring and how I can use a Java backend with a 
React based frontend.

# Eclipse Setup

Recommend import as a gradle project.

You must run the gradle build to generate QueryDSL source.
You must add the generated source directories to the eclipse project build path 
by opening the project Properties > Java Build Path > Source and clicking the 
_Add Folder..._ button.

At the time of writing, the only generated source folder is 
`build/generated/sources/annotationProcessor/java/main`.

It's not worth automating.

