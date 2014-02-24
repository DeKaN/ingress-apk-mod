package com.nianticproject.ingress.gameentity.components;

import com.nianticproject.ingress.gameentity.EntityComponent;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multiset;

public interface Portal extends EntityComponent, Levelable {
	ImmutableSet getOwnerIds();
	ImmutableMap getLinkedResonatorLevels();
	Multiset resonatorLevelsForOwner(String s);
}
