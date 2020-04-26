
$name = "Lionel Messi";

sub BarcaName {
print "Barcelona Player: $name \n";
}

sub Static_Scope {

my $name = "Luis Suarez";
BarcaName();
}


sub Dynamic_Scope {

local $name = "Luis Suarez";
BarcaName();
}

print "Static Scope \n";
Static_Scope();

print "Dynamic Scope \n";
Dynamic_Scope();