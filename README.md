# Overview
This is a sample drools project that can be used for quick Drools testing without much setup. 

# What's Included
Here's what's in this project.
1. pom.xml that has uses the Drools BOM to make adding Drools dependencies easier.
1. An empty kmodule.xml for quick deployment of the default KIE session.
1. An AgendaEventListener to capture what rules are fired.
1. An abstract super class for junit tests to quickly create a KIE session to be used for rules firing.
1. A sample junit test.
1. A sample rule containing metadata for reference.

# What Should be Customized

1. Add domain classes or add dependency in the pom.xml for external domains.
1. Create rules.
1. Create junit tests.
