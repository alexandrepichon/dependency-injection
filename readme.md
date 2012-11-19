Execution : 
<pre> 
-- First call of service -->
Creating : di.Service@13cb8654
Calling doSomething on : di.Service@13cb8654
Creating : di.Dao@16dffef3
Calling find on : di.Dao@16dffef3
Creating : di.DbConnection@21b20e62
Calling query on : di.DbConnection@21b20e62
-- Second call of service -->
Calling doSomething on : di.Service@13cb8654
Calling find on : di.Dao@16dffef3
Creating : di.DbConnection@30ce5536
Calling query on : di.DbConnection@30ce5536
</pre> 
