package com.android.example.module06_module083_module06

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module06_module321_module10.ClassAAG = com.android.example.module06_module321_module10.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module06_module083_module09.ClassAAA = com.android.example.module06_module083_module09.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module06_module109_module1.ClassAAD = com.android.example.module06_module109_module1.ClassAAD()
	private 	val instance_var_1_3: com.android.example.module06_module083_module09.ClassAAA = com.android.example.module06_module083_module09.ClassAAA()

	fun method0(
		param0: com.android.example.module06_module083_module09.ClassAAC,
		param1: com.android.example.module06_module321_module10.ClassAAA
	) {
		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.clear()

		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.dispose()

		}
	}

	fun method1(
		param0: com.android.example.module06_module109_module1.ClassAAJ
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.isDisposed()

	}

	fun method2(
		param0: com.android.example.module06_module109_module1.ClassAAC,
		param1: com.android.example.module06_module109_module1.ClassAAI
	) {
		param0.method1("SomeString", "SomeString", "SomeString")

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isCancelled()

	}
}
