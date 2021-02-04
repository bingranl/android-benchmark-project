package com.android.example.module06_module184

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_1: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_2: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
	private 	val instance_var_1_3: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: dagger.internal.DelegateFactory<kotlin.Any>,
		param2: dagger.internal.DelegateFactory<kotlin.Any>,
		param3: dagger.internal.DelegateFactory<kotlin.Any>
	) {
	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		for (iAb in 0..3) {
			val local_var_3_0: com.android.example.module06_module063_module6.ClassAAF = com.android.example.module06_module063_module6.ClassAAF()
			local_var_3_0.method2(com.android.example.module06_module014_module1.ClassAAB(), com.android.example.module06_module014_module1.ClassAAB())

		}
		val local_var_2_1: com.android.example.module06_module339_module1.ClassAAI = com.android.example.module06_module339_module1.ClassAAI()
		local_var_2_1.method2(com.android.example.module06_module114.ClassAAA(), com.android.example.module06_module342_module3.ClassAAB(), com.android.example.module06_module356_module1.ClassAAH())

		param0.assertNotSubscribed()

	}

	fun method2(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_4: com.android.example.module06_module063_module6.ClassAAB = com.android.example.module06_module063_module6.ClassAAB()
		local_var_2_4.method0(com.android.example.module06_module014_module1.ClassAAC(), com.android.example.module06_module014_module1.ClassAAG(), com.android.example.module06_module014_module1.ClassAAI())

	}
}
