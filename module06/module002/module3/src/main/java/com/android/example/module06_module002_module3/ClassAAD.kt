package com.android.example.module06_module002_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: com.android.example.module06_module002_module2.ClassAAG = com.android.example.module06_module002_module2.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module06_module002_module2.ClassAAJ = com.android.example.module06_module002_module2.ClassAAJ()
	private 	val instance_var_1_2: com.android.example.module06_module002_module5.ClassAAE = com.android.example.module06_module002_module5.ClassAAE()
	private 	val instance_var_1_3: com.android.example.module06_module002_module2.ClassAAA = com.android.example.module06_module002_module2.ClassAAA()

	fun method0(
		param0: com.android.example.module06_module002_module2.ClassAAG,
		param1: com.android.example.module06_module002_module5.ClassAAJ
	) {
		param0.method1(com.android.example.module06_module002_module5.ClassAAF(), com.android.example.module06_module002_module5.ClassAAH(), com.android.example.module06_module002_module5.ClassAAF())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.hasSubscription()

	}

	fun method1(
		param0: com.android.example.module06_module002_module2.ClassAAA,
		param1: com.android.example.module06_module002_module2.ClassAAH
	) {
	}

	fun method2(
		param0: com.android.example.module06_module002_module2.ClassAAG
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
			local_var_3_0.isDisposed()

		}
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.cancel()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.request(-3080161120871633456)

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onNext(kotlin.Any())

	}
}
