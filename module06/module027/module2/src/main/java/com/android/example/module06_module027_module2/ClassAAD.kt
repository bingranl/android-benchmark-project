package com.android.example.module06_module027_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: com.android.example.module06_module027_module1.ClassAAD = com.android.example.module06_module027_module1.ClassAAD()
	private 	val instance_var_1_1: com.android.example.module06_module027_module1.ClassAAD = com.android.example.module06_module027_module1.ClassAAD()
	private 	val instance_var_1_2: com.android.example.module06_module027_module3.ClassAAI = com.android.example.module06_module027_module3.ClassAAI()
	private 	val instance_var_1_3: com.android.example.module06_module027_module3.ClassAAI = com.android.example.module06_module027_module3.ClassAAI()

	fun method0(
		param0: com.android.example.module06_module027_module1.ClassAAC
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.dispose()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isDisposed()

	}

	fun method1(
		param0: com.android.example.module06_module027_module1.ClassAAI,
		param1: com.android.example.module06_module027_module1.ClassAAB,
		param2: com.android.example.module06_module027_module1.ClassAAA
	) {
	}

	fun method2(
		param0: com.android.example.module06_module027_module1.ClassAAE,
		param1: com.android.example.module06_module027_module3.ClassAAJ,
		param2: com.android.example.module06_module027_module1.ClassAAE,
		param3: com.android.example.module06_module027_module3.ClassAAG
	) {
		listOf("1", "2", "3").forEach {
			param0.method0(com.android.example.module06_module027_module3.ClassAAE(), com.android.example.module06_module027_module3.ClassAAF(), com.android.example.module06_module027_module3.ClassAAJ())

			val local_var_3_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
			local_var_3_0.dispose()

		}
	}
}
