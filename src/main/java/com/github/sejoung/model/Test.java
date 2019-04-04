package com.github.sejoung.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Test {
	private String firstName;
	private String lastName;
}