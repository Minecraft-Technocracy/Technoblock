package net.cydhra.technoblock.api

/**
 * Implementations of this interface verify a structure and return an instance of [MultiBlockStructure] that is an
 * aggregation of all components that make up a legal and complete multi-block-structure. The implementation can
 * choose the method of verification but the produced result's functionality must not depend on the used assembly
 * method.
 */
interface MultiBlockAssembler {
}