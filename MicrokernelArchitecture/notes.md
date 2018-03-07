## [Microkernel Architecture]
* The **NewEngine** is the core kernel. It loads all the news item modules from *modules.properties* 
* **modules.properties** is the registry
* **NewsItem** is the contract for every module to plug-in to the kernel
* **RegionalNews**, **SportsNews**, **WeatherNews** are pluggable modules 